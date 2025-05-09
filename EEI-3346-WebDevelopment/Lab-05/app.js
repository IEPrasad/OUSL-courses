new Vue({
  el: '#app',
  data: {
      message: ''
  },
  methods: {
      showMessage(color) {
          switch (color) {
              case 'red':
                  this.message = 'Stop! The traffic signal is red.';
                  break;
              case 'yellow':
                  this.message = 'Slow down! The traffic signal is yellow.';
                  break;
              case 'green':
                  this.message = 'Go! The traffic signal is green.';
                  break;
          }
      }
  }
});
