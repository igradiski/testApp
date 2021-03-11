import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import './App.css';
import { Table, Tag, Input, Button, Space, Form, Checkbox } from 'antd';
import Highlighter from 'react-highlight-words';
import { SearchOutlined } from '@ant-design/icons';
import axios from 'axios';
import 'antd/dist/antd.css';

import FilterCustom from "../src/FilterCustom"



const App = () => {
  const urlBasic = "https://jsonplaceholder.typicode.com/users/5";
  const [url, setUrl] = useState(`https://jsonplaceholder.typicode.com/users`);
  const [searchInput, setsearchInput] = useState("");
  const [searchText, setsearchText] = useState([]);
  const [searchedColumn, setsearchedColumn] = useState("");
  const [role, setRole] = useState([]);
  const [loading, setloading] = useState(true);
  const [id, setid] = useState("");


  const getData = async () => {
    console.log(url)
    await axios.get(url).then(
      res => {
        setloading(false);
        setRole(res.data) 
      }
    );
  };
  useEffect(() => {
    getData();
  }, [url]);

  const getColumnSearchProps = dataIndex => ({
    filterDropdown: ({ setSelectedKeys, selectedKeys, confirm, clearFilters }) => (
      <div style={{ padding: 8 }}>
        <Input
          ref={node => {
            setsearchInput(node);
          }}
          placeholder={`Search ${dataIndex}`}
          value={selectedKeys[0]}
          onChange={e => setSelectedKeys(e.target.value ? [e.target.value] : [])}
          onPressEnter={() => handleSearch(selectedKeys, confirm, dataIndex)}
          style={{ width: 188, marginBottom: 8, display: 'block' }}
        />
        <Space>
          <Button
            type="primary"
            onClick={() => handleSearch(selectedKeys, confirm, dataIndex)}
            icon={<SearchOutlined />}
            size="small"
            style={{ width: 90 }}
          >
            Search
          </Button>
          <Button onClick={() => handleReset(clearFilters)} size="small" style={{ width: 90 }}>
            Reset
          </Button>
          <Button
            type="link"
            size="small"
            onClick={() => {
              confirm({ closeDropdown: false });
              setsearchText(selectedKeys[0]);
              setsearchedColumn(dataIndex);
            }}
          >
            Filter
          </Button>
        </Space>
      </div>
    ),
    filterIcon: filtered => <SearchOutlined style={{ color: filtered ? '#1890ff' : undefined }} />,
    onFilter: (value, record) =>
      record[dataIndex]
        ? record[dataIndex].toString().toLowerCase().includes(value.toLowerCase())
        : '',
    onFilterDropdownVisibleChange: visible => {
      if (visible) {
        setTimeout(() => searchInput, 100);
      }
    },
    render: text =>
      searchedColumn === dataIndex ? (
        <Highlighter
          highlightStyle={{ backgroundColor: '#ffc069', padding: 0 }}
          searchWords={[searchText]}
          autoEscape
          textToHighlight={text ? text.toString() : ''}
        />
      ) : (
          text
        ),
  });

  const handleSearch = (selectedKeys, confirm, dataIndex) => {
    confirm();
    setsearchText(selectedKeys[0]);
    setsearchedColumn(dataIndex);
  };

  const handleReset = clearFilters => {
    clearFilters();
    setsearchText("")
  };

  const layout = {
    labelCol: {
      span: 8,
    },
    wrapperCol: {
      span: 16,
    },
  };
  const tailLayout = {
    wrapperCol: {
      offset: 8,
      span: 16,
    },
  };
  const onFinish = (values) => {
    console.log('Success:', values);
  };

  const onFinishFailed = (errorInfo) => {
    console.log('Failed:', errorInfo);
  };

  const columns = [
    {
      title: 'Name',
      dataIndex: 'Name',
      key: 'Name',
      ...getColumnSearchProps("Name")
    },
    {
      title: 'Email',
      dataIndex: 'Email',
      key: 'Email',
    },
  ];
  const getFilteredData = () => {
    console.log("click");
    setUrl(`${urlBasic}/${id}`)
  }

  return (
    <div className="App">
      <Form
        {...layout}
        name="basic"
        initialValues={{
          remember: true,
        }}
        onFinish={onFinish}
        onFinishFailed={onFinishFailed}
      >
        <Form.Item
          label="ID"
          name="Id"
          rules={[
            {
              required: true,
              message: 'Enter id:',
            },
          ]}

        >
          <Input value={id} onChange={e => setid(e.target.value)} />
        </Form.Item>
        <Form.Item {...tailLayout}>
          <Button type="primary" htmlType="submit" onClick={getFilteredData}>
            Fitler
        </Button>
        </Form.Item>
      </Form>
      {loading ? (
        ""
      ) : (
          <Table columns={columns} dataSource={role} />
        )}
    </div>
  );
}
export default App;
