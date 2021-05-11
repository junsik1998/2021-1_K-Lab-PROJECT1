import * as React from "react";
import { Text, View, StyleSheet, Image, Button } from "react-native";
import Icon from 'react-native-vector-icons/Ionicons';
export default function InfoScreen() {
  return (
    <View style={styles.container}>
      
      <View
         style={{
          flex: 0.5,
          //alignItems: "center",
          //justifyContent: "center",
          margin: 5,
          padding: 15,
          
        }}
      >
      </View>
      <View style = {{flex:1, flexDirection : 'row'}}>
        
          <View style = {{flex:1}}/>
          <View style = {{flex:1,alignItems : "center"}}><Text style = {{ fontSize : 25 }}>Info</Text></View>
          <View style = {{flex:0.8,alignItems : "flex-end"}}><Icon style = {{fontSize : 25}} name="menu"></Icon></View>
          <View style = {{flex : 0.2}}/>
      </View>

      <View
        title="Garden title"
        style={{
          flex: 1,
          alignItems: "center",
          justifyContent: "center",
       
        }}
      >
        <Text style = {{fontSize : 30}}>Wijkpark Hesselingen</Text>
      </View>
      <View
        style = {{flex:2, alignItems : "center",
        justifyContent: "center",
        
      }}
      >

      </View>
      <View
        style = {{flex: 2,  alignItems: "center",
        justifyContent: "center",}}
      >
        <Text>Position</Text>
        <Image
        style={{ resizeMode: "contain" }}
        source={require("../assets/position.jpeg")}
      />
      </View>
      
        <View
        style={{flex:2}}
        >

        </View>
      <View
      style = {{flex: 4,  alignItems: "center",
      justifyContent: "center",}}
      >
        <Text>Picture</Text>
        <Image
          style={{width : 300, height: 300}}
          source={require("../assets/garden.jpeg")}
        />
      </View>
  
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
