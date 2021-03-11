import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';
import './App.css';
import { Table, Tag, Input, Button, Space } from 'antd';
import Highlighter from 'react-highlight-words';
import { SearchOutlined } from '@ant-design/icons';
import 'antd/dist/antd.css';

const handleSearch = (selectedKeys, confirm, dataIndex) => {

};

const handleReset = clearFilters => {

};

const FilterCustom = (props) => {

    const [searchText, setsearchText] = useState("");
    const [searchedColumn, setsearchedColumn] = useState("");
    const [searchInput, setsearchInput] = useState("");

    return(
        <div style={{ padding: 8 }}>
        <Input   
         />
        <Space>
            <Button
                type="primary"
                icon={<SearchOutlined />}
                size="small"
                style={{ width: 90 }}
            >
                Search
      </Button>
            <Button onClick={() => { }} size="small" style={{ width: 90 }}>
                Reset
      </Button>
            <Button
                type="link"
                size="small"
                onClick={() => {

                }}
            >
                Filter
      </Button>
        </Space>
    </div>
    )
    
};
export default FilterCustom;