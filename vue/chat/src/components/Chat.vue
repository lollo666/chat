<template>
  <button type="" class="top-right" @click="resetChat">reset chat</button>
  <message-list></message-list>
  <form-msg class="bottom"></form-msg>
</template>
<script>
import MessageList from "./MessageList.vue";
import FormMsg from "./FormMsg.vue";
import axios from "axios";
import { SERVER_URL } from "../hooks/confg";
import { useStore } from "vuex";
export default {
  components: {
    MessageList,
    FormMsg,
  },
  setup() {
    const store = useStore();
    function resetChat() {
      axios.get(SERVER_URL + "messages/clear").ther((res) => {
        store.dispatch("setMessages", res.data);
      });
    }
    return {
      resetChat,
    };
  },
};
</script>
<style scoped>
.bottom {
  padding: 5px;
  border: 1px solid red;
  position: absolute;
  bottom: 0;
  width: 100%;
  text-align: center;
}
.top-right {
  float: right;
}
</style>