import {
  NavigationHelpersContext,
  useNavigation,
} from "@react-navigation/core";
import * as React from "react";
import { Text, View, StyleSheet, SafeAreaView, Touchable } from "react-native";
import { ScrollView, TouchableOpacity } from "react-native-gesture-handler";

export default function ActivityScreen({ navigation }) {
  const onPress = () => {
    navigation.navigate("ActivityArticle");
  };
  return (
    <SafeAreaView style={styles.container}>
      <ScrollView style={{ flex: 1 }}>
        <TouchableOpacity onPress={onPress} style={{ flex: 1 }}>
          <View style={styles.borderBox}>
            <View style={{ flex: 6 }}>
              <Text style={{}}>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit,
              </Text>
            </View>
            <View style={{ flex: 1 }}>
              <Text> 1/4</Text>
              <TouchableOpacity
                style={{
                  justifyContent: "center",
                  borderColor: "gray",
                  borderWidth: 1,
                  //   padding: 4,
                }}
              >
                <Text>Cancel</Text>
              </TouchableOpacity>
            </View>
          </View>
        </TouchableOpacity>
        <TouchableOpacity onPress={onPress} style={{ flex: 1 }}>
          <View style={styles.borderBox}>
            <View style={{ flex: 6 }}>
              <Text style={{ flex: 1 }}>
                Lorem ipsum dolor sit amet, consectetur adipiscing elit,
              </Text>
            </View>
            <View style={{ flex: 1 }}>
              <Text> 3/4</Text>
              <TouchableOpacity
                style={{
                  justifyContent: "center",
                  borderColor: "gray",
                  borderWidth: 1,
                  //   padding: 4,
                }}
              >
                <Text>Cancel</Text>
              </TouchableOpacity>
            </View>
          </View>
        </TouchableOpacity>
        <View style={styles.borderBox}>
          <TouchableOpacity onPress={onPress}>
            <Text style={{ flex: 1 }}>
              Vestibulum fermentum mauris sed elit maximus, ac accumsan ipsum
              accumsan.
            </Text>
          </TouchableOpacity>
        </View>
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  borderBox: {
    flex: 1,
    margin: 5,
    padding: 15,
    flexDirection: "row",
    borderColor: "grey",
    borderWidth: 1,
    borderRadius: 5,
  },
});
