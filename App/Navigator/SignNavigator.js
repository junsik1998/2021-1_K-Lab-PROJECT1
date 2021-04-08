import * as React from "react";
import { NavigationContainer, StackActions } from "@react-navigation/native";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { createStackNavigator} from '@react-navigation/stack';
import Init from "../Screens/Init"
import SignIn from "../Screens/SignIn"
import SignUp from "../Screens/SignUp"

const Stack = createStackNavigator();

export default function SignNavigator() {
  return (
    <NavigationContainer independent = {true}> 
      <Stack.Navigator initialRouteName = "Init">
        <Stack.Screen name = "Init" component = {Init}/>
        <Stack.Screen name = "SignUp" component = {SignUp}/>
        <Stack.Screen name = "SignIn" component = {SignIn}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}

