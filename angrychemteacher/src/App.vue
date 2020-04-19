<template>
  
  <v-app>
    <h3>Insert chem question here</h3>
    <v-container fluid>
    <v-textarea
      v-model="inputAnswer"
      clearable
      clear-icon="cancel"
      label="Text"
      value="This is clearable text."
    ></v-textarea>
    <div class="my-2">
        <!--<v-btn @click="buttonPressed()" small>Submit</v-btn>-->
        <v-btn v-on:click="buttonPressed()" small>Submit</v-btn>

      </div>
  </v-container>
    
  </v-app>
</template>

<script>
export default {
  
  name: 'App',

  components: {
  },

  data: () => ({
    //
    inputAnswer: "",

    methods: {
      buttonPressed () {
        console.log('Button pressed. value of input answer is ' + this.inputAnswer);
      },
      
    },
  }),
};
</script>
