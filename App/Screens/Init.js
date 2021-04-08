import React, { useState } from "react";
import { Button, StyleSheet, Text, View } from 'react-native';

export default function Init({navigation}) {
    const onPressSignUp=()=>{
      
        navigation.navigate("SignUp")
  
    }
    const onPressSignIn=()=>{
      navigation.navigate("SignIn")
    }
    return (
      <View style={styles.container}>
          <View style ={styles.button}>
            <Button title = "Sign up" 
              onPress = {onPressSignUp}
            ></Button>
          </View>
          <View style = {styles.button}>
            <Button title = "Sign in"
            onPress = {onPressSignIn}
             ></Button>
          </View>
          
      </View>
    );
  }


const styles = StyleSheet.create({
    container: {
      flex: 1,
      //backgroundColor: '#fff',
      alignItems: 'center',
      justifyContent: 'center',
    },
    button :{
    flex: 1,
      //backgroundColor: '#fff',
      //alignItems: 'center',
      justifyContent: 'center',
    }
  });