import * as React from "react";
import { Text, View, StyleSheet, SafeAreaView, Touchable } from "react-native";
import { ScrollView, TouchableOpacity,TextInput } from "react-native-gesture-handler";

export default function ActivityArticle(){
    return(
        <SafeAreaView style = {styles.container}>
            <View style = {{margin : 5,
                padding : 15,
                borderColor : "grey",
                borderWidth : 1,
                borderRadius : 5,
                flex : 1}}>

                <View style = {{flex:2, alignItems :"center", justifyContent:"center"}} title = "title">
                    <Text>Article Title</Text>
                </View>
            </View>
            <View style = {{flex:1, flexDirection:"row" , alignItems :"center", justifyContent:"center",
            margin : 5,
            padding : 15,
            borderColor : "grey",
            borderWidth : 1,
            borderRadius : 5,
        }} title = "date and writer">
                <View style ={{flex:3,alignItems :"center", justifyContent:"center"}} title = "date">
                    <Text>2021-04-21</Text>
                </View>
                <View style = {{flex:1 ,alignItems :"center", justifyContent:"center"}} title = "writer">
                    <Text>K-Developer</Text>
                </View>
                
            </View>
            <View style = {{flex : 3 ,margin : 5,
                padding : 15,
                borderColor : "grey",
                borderWidth : 1,
                borderRadius : 5 }} title = "content">
                <Text>
                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
                when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
                It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. 
                It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, 
                and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
                </Text>
            </View>
            <View style = {{flex : 3}} title = "commets">
                <ScrollView style = {{flex : 1}}>
                    <View style = {styles.borderBox}>
                        <Text style = {{flex : 1}}>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit,
                        </Text>
                    </View>
                    <View style = {styles.borderBox}>

                        <Text style = {{flex : 1}}>
                            Vestibulum fermentum mauris sed elit maximus, ac accumsan ipsum accumsan.
                            </Text>
                    </View>
                    <View style = {styles.borderBox}>

                        <Text style = {{flex : 1}}>
                        Morbi sit amet magna commodo, vehicula nibh ut, lacinia magna.
                        </Text>
                    </View>

                    <View style = {styles.borderBox}>

                        <Text style = {{flex : 1}}>
                        Aenean quis risus eu ipsum interdum gravida eget vitae mauris.
                        </Text>
                    </View>
                </ScrollView>
            </View>
            <View style = {{flex : 1, flexDirection : "row"}} title = "writeComment" >
                    <TextInput
                        placeholder = "comment"
                        style = {{margin : 5,
                            padding : 15,
                            borderColor : "grey",
                            borderWidth : 1,
                            borderRadius : 5,
                            flex : 6}}
                    ></TextInput>
                    <TouchableOpacity
                    style = {{
                        margin : 5,
                        padding : 15,
                        borderColor : "grey",
                        borderWidth : 1,
                        borderRadius : 5,
                        flex : 1,
                        alignItems : "center",
                        justifyContent : "center"
                    }}
                    >
                        <Text>submit</Text>
                    </TouchableOpacity>

            </View>
        </SafeAreaView>
    );
}

const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: "#fff",
      //alignItems: "center",
      //justifyContent: "center",
    },
    
    borderBox : {
      margin : 5,
      padding : 15,
      borderColor : "grey",
      borderWidth : 1,
      borderRadius : 5
  },
  });
  