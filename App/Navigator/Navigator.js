import * as React from "react";
import { NavigationContainer, StackActions } from "@react-navigation/native";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { createStackNavigator} from '@react-navigation/stack';
import ActivityScreen from "../Screens/ActivityScreen";
import InfoScreen from "../Screens/InfoScreen";
import SNSScreen from "../Screens/SNSScreen";
import ActivityTable from "../Screens/ActivityTable"

const Tab = createBottomTabNavigator();
const Stack = createStackNavigator();

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
