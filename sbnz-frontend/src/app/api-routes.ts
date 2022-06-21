const backend = "http://localhost:8080/";
const championsAPI = backend + "champions/";
const questionnaireAPI = backend + "questionnaire/"

// champion routes
export const GET_ALL_CHAMPIONS = championsAPI + "getAll";

// questionnaire routes
export const SUBMIT_QUESTIONNAIRE = questionnaireAPI + "submit";
