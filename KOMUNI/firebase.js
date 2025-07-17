// src/firebase.js
import { initializeApp } from "firebase/app";
import { getDatabase } from "firebase/database";

// ⚠️ Usa los valores reales de tu proyecto (puedes copiarlos desde Firebase console)
const firebaseConfig = {
  apiKey: "TU_API_KEY",
  authDomain: "komuni-app.firebaseapp.com",
  databaseURL: "https://komuni-app-default-rtdb.europe-west1.firebasedatabase.app",
  projectId: "komuni-app",
  storageBucket: "komuni-app.appspot.com",
  messagingSenderId: "TU_MESSAGING_ID",
  appId: "TU_APP_ID"
};

// Inicializar Firebase
const app = initializeApp(firebaseConfig);
const database = getDatabase(app);

export { database };
