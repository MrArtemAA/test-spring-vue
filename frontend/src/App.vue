<template>
  <div id="app">
    <b-navbar type="dark" variant="dark">
      <b-navbar-brand href="#">{{ title }}</b-navbar-brand>
    </b-navbar>
    <b-container fluid>
      <br/>
      <router-view/>
    </b-container>
  </div>
</template>

<script>
export default {
  name: 'App',

  data () {
    return {
      title: 'SpringBoot + Vue (+ BootstrapVue)'
    }
  }
}
</script>

<style>
/*#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}*/
</style>
