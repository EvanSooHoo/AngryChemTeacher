  <template>
  <v-app>
    <v-card>
      <v-card-title primary-title class="justify-center">
        <p>Insert chem question here</p>
      </v-card-title>
      <v-container fluid>
        <v-textarea
          v-model="inputAnswer"
          clearable
          clear-icon="cancel"
          label="Type your answer here"
          value="This is clearable text."
        ></v-textarea>

        <!--<v-btn @click="buttonPressed()" small>Submit</v-btn>-->
        <v-row no-gutters>
          <v-col>
            <v-row justify="center">
                <v-btn @click="buttonPressed" small>Submit</v-btn>
            </v-row >
          </v-col>
        </v-row>
      </v-container>
    </v-card>
    <p class="text-center">Lecture section</p>
    <v-card>
      <v-container fluid>
        <v-textarea value="This is clearable text."></v-textarea>
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
