import React, { useState } from "react";
import {
  Button,
  StyleSheet,
  Text,
  TextInput,
  TouchableOpacity,
  View,
  Dimensions,
} from "react-native";
import { Ionicons } from "@expo/vector-icons";
const windowWidth = Dimensions.get("window").width;
const windowHeight = Dimensions.get("window").height;

export default function SignIn({ navigation }) {
  return (
    <View style={{ flex: 1, backgroundColor: "#fff" }}>
      <View
        style={{ flex: 1, paddingTop: 40, margin: 10, flexDirection: "row" }}
      >
        <TouchableOpacity
          style={{ flex: 1 }}
          onPress={() => navigation.goBack()}
        >
          <Ionicons name="ios-arrow-back" size={25} color="#3399ff" />
        </TouchableOpacity>
        <View style={{ flex: 1, alignItems: "center" }}>
          <Text style={{ fontSize: 20, fontWeight: "700" }}> Sign In</Text>
        </View>
        <View style={{ flex: 1 }}></View>
      </View>
      <View style={{ flex: 1 }}></View>

      <View style={styles.container}>
        <View style={{ flex: 2 }}></View>

        <View style={{ flex: 1 }}>
          <TextInput placeholder="E-mail" style={styles.borderBox}></TextInput>
        </View>
        <View style={{ flex: 1 }}>
          <TextInput
            placeholder="Password"
            style={styles.borderBox}
          ></TextInput>
        </View>

        <TouchableOpacity
          style={{ flex: 1.5, alignItems: "center" }}
          onPress={() => navigation.navigate("Main")}
        >
          <View style={styles.borderBox}>
            <Text>Submit</Text>
          </View>
        </TouchableOpacity>
      </View>
      <View style={{ flex: 1 }}></View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 2,
    backgroundColor: "#fff",
    // alignItems: "center",
    // justifyContent: "center",
  },
  text: {
    flex: 1,
    alignItems: "center",
  },

  borderBox: {
    padding: 15,
    borderColor: "grey",
    borderWidth: 1,
    borderRadius: 5,
    marginHorizontal: 50,
  },
  button: {
    padding: 5,
    borderColor: "grey",
    borderWidth: 1,
    borderRadius: 5,
  },
});
