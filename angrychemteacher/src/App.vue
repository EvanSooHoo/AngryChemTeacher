  <template>
  <v-app>
    
    <p>Insert chem question here</p>
    <v-card>
      <v-container fluid>
        <v-textarea
          v-model="inputAnswer"
          clearable
          clear-icon="cancel"
          label="Type your answer here"
          value="This is clearable text."
        ></v-textarea>

        <!--<v-btn @click="buttonPressed()" small>Submit</v-btn>-->
        <v-layout row>
          <v-col cols="6" offset="5">
            <div>
              <v-btn @click="buttonPressed" small>Submit</v-btn>
            </div>
          </v-col>
        </v-layout>
      </v-container>
    </v-card>
  </v-app>
</template>

<script>
export default {
  name: "App",

  components: {},
  methods: {
    buttonPressed() {
      this.clickCount++;
      console.log(
        "Button pressed. value of input answer is " + this.inputAnswer
      );
      console.log("Value of click count is " + this.clickCount);
    }
  },

  data: () => ({
    //
    inputAnswer: "",
    clickCount: 0
  })
};
</script>
