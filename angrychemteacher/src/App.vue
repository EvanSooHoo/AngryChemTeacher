<template>
  <v-app>
    <v-card>
      <v-card-title primary-title class="justify-center">
        <p>{{ questionText }}</p>
      </v-card-title>
      <v-container fluid>
        <v-textarea
          v-model="inputAnswer"
          label="Type your answer here"
          value="This is clearable text."
        ></v-textarea>

        <!--<v-btn @click="buttonPressed()" small>Submit</v-btn>-->
        <v-row no-gutters>
          <v-col>
            <v-row justify="center">
              <v-btn @click="buttonPressed" small>Submit</v-btn>
            </v-row>
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
    <v-container>
      <h1 class="text-center">Balance the chemical equation</h1>
      <v-spacer></v-spacer>
      <v-row>
        <v-col cols="12" sm="6" md="2">
          <v-text-field label="Outlined" outlined></v-text-field>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <h1>
            {{ firstElement }}<sub>{{firstSubscript}}</sub>
          </h1>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <v-text-field label="Outlined" outlined></v-text-field>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <h1>{{ secondElement }}<sub>{{secondSubscript}}</sub></h1>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <v-text-field label="Outlined" outlined></v-text-field>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <h1>
            {{ productElement }}<sub>{{thirdSubscript}}</sub>
          </h1>
        </v-col>
      </v-row>
    </v-container>
  </v-app>
</template>

<script>
export default {
  name: "App",

  components: {},
  methods: {
    processName(inputName) {
      inputName = inputName.toLowerCase();
      if (inputName === "kai") {
        this.questionText =
          "KAI?!  GET OUT OF MY CLASS.  Just kidding.  You're a very good student.";
        this.firstGrade = "A";
      } else if (inputName === "zaid") {
        this.questionText = "Zaid? Rock on";
      } else if (inputName === "15/25") {
        this.questionText = "Bonus activated";
      } else if (inputName === "david" || inputName === "jon") {
        this.firstGrade = "A";
      } else if (inputName === "stanley") {
        this.firstGrade = "A+";
      } else {
        this.firstGrade = "B+";
      }
    },
    buttonPressed() {
      this.clickCount++;
      console.log(
        "Button pressed. value of input answer is " + this.inputAnswer
      );
      console.log("Value of click count is " + this.clickCount);
      this.processName(this.inputAnswer);
      if (this.clickCount == 1) {
        var fullStr =
          this.inputAnswer +
          ", come to the board. Prove that you deserve your " +
          this.firstGrade;
        this.questionText = fullStr;
        this.firstElement = "Fe";
        this.firstSubscript = "2";
        this.secondElement = "Cl";
        this.secondSubscript = "3";
        this.productElement = "FeCl";
        this.thirdSubscript = "3";
      }
    }
  },

  data: () => ({
    //
    inputAnswer: "",
    clickCount: 0,
    questionText:
      "\nWelcome to Ay Nako! Enter your name and hit submit to proceed",
    gradeValue: "",
    firstElement: "",
    secondElement: "",
    productElement: "",
    firstSubscript: "",
    secondSubscript: "",
    thirdSubscript: ""
  })
};
</script>
