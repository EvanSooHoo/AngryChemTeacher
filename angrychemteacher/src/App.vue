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
        <v-btn @click="buttonPressed" small>Submit</v-btn>

      </div>
  </v-container>
    
  </v-app>
</template>

<script>
export default {
  
  name: 'App',

  components: {
  },
  methods: {
      buttonPressed () {
        this.clickCount++;
        console.log('Button pressed. value of input answer is ' + this.inputAnswer);
        console.log('Value of click count is ' + this.clickCount); 
      },
      
    },

  data: () => ({
    //
    inputAnswer: "",
    clickCount: 0

    
  }),
};
</script>
