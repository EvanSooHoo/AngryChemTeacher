<template>
  <v-app>
    <v-card>
      <v-card-title primary-title class="justify-center">
        <p>{{ questionText }}</p>
      </v-card-title>
      <v-card-text
        primary-title
        class="justify-center headline font-weight-bold"
      >
        <center>{{ questionTextLineTwo }}</center>
      </v-card-text>
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
              <v-btn @click="buttonPressed" :disabled="!lockBalanceButton" small>Submit</v-btn>
            </v-row>
          </v-col>
        </v-row>
      </v-container>
    </v-card>
    <p class="text-center">Lecture section</p>
    <v-card>
      <v-container fluid>
        <v-textarea></v-textarea>
      </v-container>
    </v-card>
    <v-container>
      <h1 class="text-center">Balance the chemical equation</h1>
      <v-spacer></v-spacer>
      <v-row>
        <v-col cols="12" sm="6" md="2">
          <v-text-field v-model="firstCoeff" outlined></v-text-field>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <h1>
            {{ firstElement }}<sub>{{ firstSubscript }}</sub>
          </h1>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <v-text-field v-model="secondCoeff" outlined></v-text-field>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <h1>
            {{ secondElement }}<sub>{{ secondSubscript }}</sub>
          </h1>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <v-text-field v-model="thirdCoeff" outlined></v-text-field>
        </v-col>

        <v-col cols="12" sm="6" md="2">
          <h1>
            {{ productElement }}<sub>{{ thirdSubscript }}</sub>
          </h1>
        </v-col>
        <v-col cols="12" sm="6" md="12">
          <v-row justify="center">
            <v-btn
              :disabled="lockBalanceButton"
              @click="balanceButtonPressed"
              small
              >Submit!</v-btn
            >
          </v-row>
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
    parseDoNow(inputDN) {
      inputDN = inputDN.toLowerCase();
      inputDN = inputDN.trim();
      this.score = 0;
      if (inputDN.length >= 1) {
          this.score += 50;
      } else {
          this.reason += "\nYou wrote nothing";
      }
      if (inputDN.search("neutron") != -1 && inputDN.search("proton") != -1

              && inputDN.search("electron") != -1) {

          this.score += 40;

      } else {

          this.reason += "\n-You did not mention ALL THREE sub-atomic particles";

      }

      if ((inputDN.search("building") != -1)
          || (inputDN.search("block") != -1 || inputDN.search("make") != -1)
          || (inputDN.search("fundamental") != -1)
          || (inputDN.search("important") != -1)) {
          this.score += 10;

      } else {

          this.reason += "\n-You did not say it's the building block of all things";

      }

      
    },
    processName(inputName) {
      inputName = inputName.toLowerCase();
      inputName = inputName.trim();
      console.log('value of inputName is ' + inputName);
      console.log('type is ' + typeof(inputName));
      if (inputName.includes('kai')) {
        this.questionText =
          "KAI?!  GET OUT OF MY CLASS.  Just kidding.  You're a very good student.";
        this.firstGrade = "A";
        this.questionText += "(click submit to continue)";
      } else if (inputName.includes("zaid")) {
        this.questionText = "Zaid? Rock on";
        this.questionText += "(click submit to continue)";
      } else if (inputName.includes("15/25")) {
        this.questionText = "Bonus activated";
        this.questionText += "(click submit to continue)";
      } else if (inputName.includes("david") || inputName.includes("jon")) {
        this.firstGrade = "A";
        this.questionText += "(click submit to continue)";
      } else if (inputName.includes("stanley")) {
        this.firstGrade = "A+";
        this.questionText += "(click submit to continue)";
      } else {
        this.firstGrade = "B+";
        this.questionText = "(click submit to continue)";
      }
      
    },
    validateBalance(firstCoeff, secondCoeff, thirdCoeff) {
      if(firstCoeff == 2 && secondCoeff == 3 && thirdCoeff == 2) {
        return true;
      } else {
        return false;
      }
    },
    buttonPressed() {
      this.clickCount++;
      console.log(
        "Button pressed. value of input answer is " + this.inputAnswer
      );
      console.log("Value of click count is " + this.clickCount);
      this.processName(this.inputAnswer);
      if (this.clickCount == 2) {
        var fullStr =
          this.inputAnswer +
          ", come to the board. Prove that you deserve your " +
          this.firstGrade + ' by balancing the chemical equation below';
        this.questionText = fullStr;
        this.firstElement = "Fe";
        this.secondElement = "Cl";
        this.productElement = "FeCl";
        this.lockBalanceButton = false;
      }

      else if(this.clickCount == 3) {
        this.questionText = 'DO NOW';
        this.questionTextLineTwo = 'This is a short answer question.  \nYou are to write everything you know about the atom.\n\nWhat is it made of?  \nWhat is its significance?\n\nYou will be given a score out of 100 based on your short answer response:';
      }
      else if(this.clickCount == 4) {
        this.parseDoNow(this.inputAnswer);
        this.questionText = 'Your score is ' + this.score + ' because ' + this.reason;
      }

    },
    balanceButtonPressed() {
       var isCorrect = this.validateBalance(parseInt(this.firstCoeff), parseInt(this.secondCoeff), parseInt(this.thirdCoeff));
       this.questionText = 'IS THAT THE ANSWER, CLASS?';
       if(isCorrect) {

         this.questionTextLineTwo += 'YES';
       } else {
         this.questionTextLineTwo += 'NO';
       }
       this.questionTextLineTwo += ' (Click submit to continue)'
       this.lockBalanceButton = true;
    }
  },

  data: () => ({
    //
    inputAnswer: "",
    clickCount: 0,
    questionText:
      "\nWelcome to Ay Nako! Enter your name and hit submit to proceed",
    questionTextLineTwo: "",
    gradeValue: "",
    lockBalanceButton: true,
    firstElement: "",
    secondElement: "",
    productElement: "",
    firstSubscript: "",
    secondSubscript: "",
    thirdSubscript: "",
    firstCoeff: "",
    secondCoeff: "",
    thirdCoeff: "",
    score: 0,
    reason: ""
  })
};
</script>
