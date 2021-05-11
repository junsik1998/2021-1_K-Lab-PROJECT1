import * as React from "react";
import { Text, View, StyleSheet, SafeAreaView, Touchable } from "react-native";
import { ScrollView, TouchableOpacity } from "react-native-gesture-handler";
import StackNavigator from "../Navigator/StackNavigator"
export default function ActivityScreen() {

  
  return (
    <StackNavigator/>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  borderBox : {
    margin : 5,
    padding : 15,
    borderColor : "grey",
    borderWidth : 1,
    borderRadius : 5
},
});
