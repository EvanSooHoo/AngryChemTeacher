  <template>
  <v-app>
    <v-card>
      <v-card-title primary-title class="justify-center">
        <p>{{questionText}}</p>
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
  </v-app>
</template>

<script>
export default {
  name: "App",

  components: {},
  methods: {
    processName(inputName)
    {
      inputName = inputName.toLowerCase();
      if (inputName === "kai") 
      {
        this.questionText = "KAI?!  GET OUT OF MY CLASS.  Just kidding.  You're a very good student.";
        this.firstGrade = "A";
      }
      else if(inputName === "zaid")
      {
        this.questionText = "Zaid? Rock on";
      }
      else if(inputName === "15/25")
      {
        this.questionText = "Bonus activated";
      }
      else if(inputName === "david" || inputName === "jon")
      {
        this.firstGrade = "A";
      }
      else if(inputName === "stanley")
      {
        this.firstGrade = "A+";
      }
      else 
      {
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
    },
    
  },

  data: () => ({
    //
    inputAnswer: "",
    clickCount: 0,
    questionText: "\nWelcome to Ay Nako! Enter your name and hit submit to proceed",
    gradeValue: "",

  })
};
</script>
