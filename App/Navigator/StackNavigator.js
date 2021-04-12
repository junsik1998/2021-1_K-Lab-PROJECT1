import * as React from "react";
import { NavigationContainer, StackActions } from "@react-navigation/native";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { createStackNavigator } from "@react-navigation/stack";

import ActivityTable from "../Screens/ActivityTable";
import ActivityArticle from "../Screens/ActivityArticle";

const Stack = createStackNavigator();

export default function StackNavigator() {
  return (
    <NavigationContainer independent={true}>
      <Stack.Navigator screenOptions={{ headerShown: false }}>
        <Stack.Screen name="ActivityTable" component={ActivityTable} />
        <Stack.Screen name="ActivityArticle" component={ActivityArticle} />
      </Stack.Navigator>
    </NavigationContainer>
  );
}
