import * as React from "react";
import { View } from 'react-native';
import Navigator from "./Navigator/Navigator";
import StackNavigator from "./Navigator/StackNavigator"
import SignNavigator from "./Navigator/SignNavigator"
export default function App() {
  var signIn = false

  if(signIn == true){
    return(
        <Navigator />  
    ); 
  }
  else{
    return(
      <SignNavigator/>
    )
  }
}


