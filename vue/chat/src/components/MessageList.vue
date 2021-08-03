<template>
  <table>
    <tbody>
      <tr v-for="msg in msgs" :key="msg.testo + msg.user">
        <th>{{ msg.user }}</th>
        <td>{{ msg.testo }}</td>
      </tr>
    </tbody>
  </table>
</template>
<script>
import axios from "axios";
import { ref } from "vue";
import { SERVER_URL } from "../hooks/confg";
import { useStore } from "vuex";
import { computed } from "vue";
export default {
  setup() {
    const store = useStore();
    const msgs = computed(() => {
      return store.state.messages;
    });
    store.dispatch("resetMsgs");

    window.setInterval(() => {
      axios.get(SERVER_URL + "messages").then((res) => {
        store.dispatch("setMessages", res.data);
      });
    }, 1000);
    const nome = ref();
    const testo = ref();

    return {
      msgs,
      nome,
      testo,
    };
  },
};
</script>
<style scoped>
th {
  font-weight: bold;
  text-align: left;
  background-color: silver;
  padding: 2px 5px;
}
td {
  text-align: left;
}
</style>