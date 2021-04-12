import * as React from "react";
import { Text, View, StyleSheet, Image, Dimensions } from "react-native";

const windowWidth = Dimensions.get("window").width;
const windowHeight = Dimensions.get("window").height;

export default function SNSComponent({ imageSrc, name, place }) {
  return (
    <View styles={styles.container}>
      <View style={styles.textContainer}>
        <Text style={styles.name}> {name} </Text>
        <Text style={styles.place}> {place} </Text>
      </View>
      <Image style={styles.image} source={imageSrc} />
      {/* // */}
      <View style={styles.commentContainer}>
        <Text>
          It is a long established fact that a reader will be distracted by the
          readable content of a page when looking at its layout.
        </Text>
      </View>
      {/*  */}
      {/* // */}
      <View style={styles.commentContainer}>
        <Text>
          It is a long established fact that a reader will be distracted by the
          readable content of a page when looking at its layout.
        </Text>
      </View>
      {/*  */}
      {/* // */}
      <View style={styles.commentContainer}>
        <Text>
          It is a long established fact that a reader will be distracted by the
          readable content of a page when looking at its layout.
        </Text>
      </View>
      {/*  */}
      {/* // */}
      <View style={styles.commentContainer}>
        <Text>
          It is a long established fact that a reader will be distracted by the
          readable content of a page when looking at its layout.
        </Text>
      </View>
      {/*  */}
    </View>
  );
}

// The point of using Lorem Ipsum is that it has a
//           more-or-less normal distribution of letters, as opposed to using
//           'Content here, content here', making it look like readable English.",
//           "Many desktop publishing packages and web page editors now use Lorem
//           Ipsum as their default model text, and a search for 'lorem ipsum' will
//           uncover many web sites still in their infancy.", "Various versions
//           have evolved over the years, sometimes by accident, sometimes on
//           purpose (injected humour and the like).", ];

const styles = StyleSheet.create({
  container: {
    flex: 1,
    margin: 10,
    backgroundColor: "black",
    alignItems: "center",
    justifyContent: "center",
  },
  textContainer: {
    paddingBottom: 10,
  },
  name: {
    fontSize: 20,
    fontWeight: "600",
    paddingLeft: 10,
    paddingBottom: 10,
  },
  place: {
    fontSize: 20,
    fontWeight: "600",
    paddingLeft: 10,
  },
  image: {
    width: null,
    height: 300,
    resizeMode: "contain",
    marginBottom: 20,
  },
  commentContainer: {
    padding: 7,
    borderBottomColor: "gray",
    borderBottomWidth: 2,
  },
});
