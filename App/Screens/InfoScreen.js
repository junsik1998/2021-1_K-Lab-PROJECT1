import * as React from "react";
import { Text, View, StyleSheet } from "react-native";

export default function InfoScreen() {
  return (
    <View style={styles.container}>
      <Text> InfoScreen</Text>
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
