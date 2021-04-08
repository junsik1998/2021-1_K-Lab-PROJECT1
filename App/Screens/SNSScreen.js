import * as React from "react";
import { Text, View, StyleSheet } from "react-native";

export default function SNSScreen() {
  return (
    <View style={styles.container}>
      <Text> SNSScreen</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
});
