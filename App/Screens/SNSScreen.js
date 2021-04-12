import * as React from "react";
import {
  StyleSheet,
  ScrollView,
  SafeAreaView,
  StatusBar,
  View,
  Text,
  Dimensions,
} from "react-native";

import SNSComponent from "../Components/SNSComponent";

const windowWidth = Dimensions.get("window").width;
const windowHeight = Dimensions.get("window").height;

export default function SNSScreen() {
  return (
    <SafeAreaView style={styles.container}>
      <ScrollView style={styles.scrollView}>
        <View
          style={{
            width: windowWidth,
            paddingVertical: 30,
          }}
        >
          <SNSComponent
            imageSrc={require("../assets/screen_1.jpeg")}
            name={"Carlos"}
            place={"Paris"}
          />
        </View>
        <View
          style={{
            width: windowWidth,
            paddingVertical: 30,
          }}
        >
          <SNSComponent
            imageSrc={require("../assets/tree_1.jpeg")}
            name={"Welsh Love"}
            place={"Garden"}
          />
        </View>
        {/* <SNSComponent imageSrc={"../assets/screen_1.jpeg"}/> */}
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    paddingTop: StatusBar.currentHeight,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  scrollView: {
    backgroundColor: "#fff",
  },
});
