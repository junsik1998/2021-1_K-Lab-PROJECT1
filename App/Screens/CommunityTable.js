import { NavigationHelpersContext, useNavigation } from "@react-navigation/core";
import * as React from "react";
import { Text, View, StyleSheet, SafeAreaView, Touchable } from "react-native";
import { ScrollView, TouchableOpacity } from "react-native-gesture-handler";

export default function ActivityScreen({navigation}) {

  const onPress = () =>{
        navigation.navigate("ActivityArticle")
  }
  return (
    <SafeAreaView style = {styles.container}>
      <ScrollView style = {{flex : 1}}>
        <TouchableOpacity onPress = {onPress}>
          <View style = {styles.borderBox}>

            <Text style = {{flex : 1}}>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit,
            </Text>
          </View>
        </TouchableOpacity>
        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>  
          <Text style = {{flex : 1}}>
          Vestibulum fermentum mauris sed elit maximus, ac accumsan ipsum accumsan.
          </Text>
        </TouchableOpacity>
        </View>
        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>

          <Text style = {{flex : 1}}>
          Curabitur efficitur nisl id dapibus placerat.
          </Text>
        </TouchableOpacity>
        </View>
        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>

          <Text style = {{flex : 1}}>
          Morbi sit amet magna commodo, vehicula nibh ut, lacinia magna.
          </Text>
        </TouchableOpacity>
        </View>
        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Aenean quis risus eu ipsum interdum gravida eget vitae mauris.
          </Text>
            </TouchableOpacity>
        </View>
        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Cras sodales dui tempus augue eleifend, interdum interdum nisi accumsan.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Phasellus eget ligula tempus, vulputate tortor eget, laoreet ligula.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Mauris et purus a massa tristique auctor.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Quisque euismod urna at nibh facilisis aliquam.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Suspendisse suscipit ligula sed faucibus faucibus.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Donec id elit sagittis, mollis elit vel, aliquam elit.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Aenean porttitor diam eget aliquet gravida.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Morbi posuere felis nec maximus gravida.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Quisque porttitor ligula id nibh malesuada, sed viverra justo mollis.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Proin finibus metus in bibendum varius.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Quisque consequat nisi vel eleifend molestie.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Pellentesque vel est eleifend, mollis urna rutrum, semper ante.
          </Text>
            </TouchableOpacity>
        </View>

        <View style = {styles.borderBox}>
        <TouchableOpacity onPress = {onPress}>
            
          <Text style = {{flex : 1}}>
          Vivamus vulputate nisi non turpis tincidunt, tempus pellentesque dolor porttitor.
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
  borderBox : {
    margin : 5,
    padding : 15,
    borderColor : "grey",
    borderWidth : 1,
    borderRadius : 5
},
});
