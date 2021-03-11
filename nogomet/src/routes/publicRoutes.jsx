import React from "react";
import {Redirect,Route} from "react-router-dom";

const publicRoute = ({ component:Component, isAuthenticated: isAuthenticated,...rest}) =>{
    return(
        <Route>
            {
                !isAuthenticated ? (
                   <Component/>
                ):(
                    <Redirect to="/"/>
                )
            }
        </Route>
    )
}

export default publicRoute;