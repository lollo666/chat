import { createStore } from 'vuex'
export default createStore({
    state: {

        /* servers */
        messages: []
    },
    mutations: {
        /* A fit-them-all commit */
        basic(state, payload) {
            state[payload.key] = payload.value
        },
        resetMessages(state) {
            state['messages'] = []
        }
    },
    actions: {
        setMessages({ commit }, messages) {
            commit('basic', {
                key: 'messages',
                value: messages
            })
        },
        resetMsgs({ commit }) {
            commit('resetMessages')
        }
    },
    modules: {
    }
})