import * as React from "react";
import { NavigationContainer, StackActions } from "@react-navigation/native";
import { createBottomTabNavigator } from "@react-navigation/bottom-tabs";
import { createStackNavigator } from "@react-navigation/stack";
import CommunityScreen from "../Screens/CommunityScreen";
import InfoScreen from "../Screens/InfoScreen";
import SNSScreen from "../Screens/SNSScreen";
import MyScreen from "../Screens/MyTable";
import ActivityTable from "../Screens/CommunityTable";
import { Ionicons } from "@expo/vector-icons";

const Tab = createBottomTabNavigator();
const Stack = createStackNavigator();

export default function Navigator() {
  return (
    <Tab.Navigator
      screenOptions={({ route }) => ({
        tabBarIcon: ({ focused, color, size }) => {
          let iconName;

          if (route.name === "Info") {
            iconName = focused
              ? "information-circle"
              : "information-circle-outline";
          } else if (route.name === "Community") {
            iconName = focused ? "people" : "people-outline";
          } else if (route.name === "My") {
            iconName = focused ? "person" : "person-outline";
          } else if (route.name === "SNS") {
            iconName = focused ? "image" : "image-outline";
          }
          return <Ionicons name={iconName} size={size} color={color} />;
        },
      })}
    >
      <Tab.Screen name="Info" component={InfoScreen} />
      <Tab.Screen name="Community" component={CommunityScreen} />
      <Tab.Screen name="My" component={MyScreen} />
      <Tab.Screen name="SNS" component={SNSScreen} />
    </Tab.Navigator>
  );
}
