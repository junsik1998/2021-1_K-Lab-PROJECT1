import React, { useState } from "react";
import { Button, StyleSheet, Text, TextInput, TouchableOpacity, View } from 'react-native';

export default function SignIn() {
    return (
    <View style = {{flex:1, flexDirection : "row"}}>
        <View style = {{flex : 1}}></View>
        <View style={styles.container}>
          <View style = {{flex:2}}>
             
          </View>  
        
        <View style = {{flex : 1}}>
                    <TextInput
                        placeholder = "E-mail"
                        style = {styles.borderBox}
                    ></TextInput>
        </View>
        <View style = {{flex : 1}}>
                    <TextInput
                        placeholder = "Password"
                        style = {styles.borderBox}
                    ></TextInput>
        </View>
        
        <TouchableOpacity style = {{flex : 1.5, alignItems : "center"}}>
            <View style = {styles.borderBox}>
            <Text>Submit</Text>
            </View>
        </TouchableOpacity>       
      </View>
      <View style = {{flex : 1}}></View>
    </View>
      
    );
  }

const styles = StyleSheet.create({
    container: {
      flex: 2,
      backgroundColor: '#fff',
      //alignItems: 'center',
      //justifyContent: 'center',
    },
    text : {
        flex : 1, 
        alignItems : "center"
    },

    borderBox : {
        padding : 15,
        borderColor : "grey",
        borderWidth : 1,
        borderRadius : 5
    },
    button : {
        padding : 5,
        borderColor : "grey",
        borderWidth : 1,
        borderRadius : 5
    }
    
  });