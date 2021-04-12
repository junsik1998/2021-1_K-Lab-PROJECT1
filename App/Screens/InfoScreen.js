import * as React from "react";
import { Text, View, StyleSheet, Image } from "react-native";

export default function InfoScreen() {
  return (
    <View style={styles.container}>
      <View
        title="Garden title"
        style={{
          flex: 2,
          alignItems: "center",
          justifyContent: "center",
          margin: 5,
          padding: 15,
          borderColor: "grey",
          borderWidth: 1,
          borderRadius: 5,
        }}
      >
        <Text>Garden Title</Text>
      </View>
      <View
        title="Garden Position"
        style={{
          flex: 1,
          alignItems: "center",
          justifyContent: "center",
          margin: 5,
          padding: 15,
          borderColor: "grey",
          borderWidth: 1,
          borderRadius: 5,
        }}
      >
        <Text>Garden Position</Text>
      </View>
      {/* <View
        title="Garden Image"
        style={{
          flex: 5,
          alignItems: "center",
          justifyContent: "center",
          margin: 5,
          padding: 15,
          borderColor: "grey",
          borderWidth: 1,
          borderRadius: 5,
        }}
      > */}
      <Image
        style={{ flex: 5, resizeMode: "contain" }}
        source={require("../assets/garden.jpeg")}
      />
      {/* </View> */}
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    //alignItems: "center",
    justifyContent: "center",
  },
});
