<template>
  <div>
    <b-table v-if="response.length != 0" striped bordered small hover head-variant="light" :items="response"></b-table>
    <b-alert v-else-if="errors.length != 0" show variant="danger">{{ errors.pop() }}</b-alert>
    <b-button v-else variant="primary" @click="callRestService">Make call</b-button>
  </div>
</template>

<script>
  import axios from 'axios'

  export default {
    name: "RestSample",

    data() {
      return {
        response: [],
        errors: []
      }
    },
    methods: {
      callRestService: function() {
        axios.get('/api/v1/sample')
          .then(response => {
          // JSON responses are automatically parsed.
            this.response = response.data;
            console.log(response.data)
          })
          .catch(e => {
              this.errors.push(e)
          })
          /*.then(function (response) {
            this.response = response.data
          })
          .catch(function (e) {
            this.errors.push(e);
          })*/
      }
    },
    beforeMount() {
      this.callRestService()
    }
  }
</script>

<style scoped>

</style>
