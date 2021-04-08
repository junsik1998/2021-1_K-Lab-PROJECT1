import * as React from "react";
import { NavigationContainer } from "@react-navigation/native";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";

import ActivityScreen from "../Screens/ActivityScreen";
import InfoScreen from "../Screens/InfoScreen";
import SNSScreen from "../Screens/SNSScreen";

const Tab = createBottomTabNavigator();

export default function Navigator() {
  return (
    <NavigationContainer>
      <Tab.Navigator>
        <Tab.Screen name="Info" component={InfoScreen} />
        <Tab.Screen name="Activities" component={ActivityScreen} />
        <Tab.Screen name="SNS" component={SNSScreen} />
      </Tab.Navigator>
    </NavigationContainer>
  );
}
