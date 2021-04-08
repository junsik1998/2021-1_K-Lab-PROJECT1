import React, { useState } from "react";
import { Button, StyleSheet, Text, View } from 'react-native';

export default function Init() {
    return (
      <View style={styles.container}>
          <View style = {{flex : 2}}></View>
          <View style ={styles.button}>
            <Button title = "Sign up" ></Button>
          </View>
          <View style = {styles.button}>
            <Button title = "Sign in" ></Button>
          </View>
          
      </View>
    );
  }


const styles = StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#fff',
      alignItems: 'center',
      justifyContent: 'center',
    },
    button :{
    flex: 1,
      backgroundColor: '#fff',
      //alignItems: 'center',
      justifyContent: 'center',
    }
  });