import * as React from "react";
import { NavigationContainer, StackActions } from "@react-navigation/native";
import { createStackNavigator } from "@react-navigation/stack";

import Init from "../Screens/Init";
import SignIn from "../Screens/SignIn";
import SignUp from "../Screens/SignUp";
import MainNavigator from "./MainNavigator";

const Stack = createStackNavigator();

export default function SignNavigator({ signIn, setSignIn }) {
  return (
    <NavigationContainer independent={true}>
      <Stack.Navigator
        initialRouteName="Init"
        screenOptions={{ headerShown: false }}
      >
        <Stack.Screen name="Init" component={Init} />
        <Stack.Screen name="SignUp" component={SignUp} />
        <Stack.Screen name="SignIn" component={SignIn} />
        <Stack.Screen name="Main" component={MainNavigator} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}
