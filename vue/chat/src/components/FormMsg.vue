<template>
  <div>
    <label for="nome">Nome</label>
    <input type="text" name="nome" v-model="nome" />
    <label for="msg">Messaggio</label>
    <input type="text" name="msg" v-model="testo" />
    <button class="btn" @click="inviaMessaggio">Invia</button>
  </div>
</template>
<script>
import { ref } from "vue";
import axios from "axios";
import { SERVER_URL } from "../hooks/confg";
import { useStore } from "vuex";
export default {
  setup() {
    const nome = ref();
    const testo = ref();
    const store = useStore();
    function inviaMessaggio() {
      const msg =
        "name=" +
        encodeURIComponent(nome.value) +
        "&msg=" +
        encodeURIComponent(testo.value);

      axios.get(SERVER_URL + "messages/add?" + msg).then((res) => {
        testo.value = "";
        store.dispatch("setMessages", res.data);
      });
    }
    return {
      nome,
      testo,
      inviaMessaggio,
    };
  },
};
</script>