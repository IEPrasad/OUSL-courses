
function toggleNavbar() {
  const navbar = document.querySelector('.navbar');
  navbar.classList.toggle('show');
}

new Vue({
  el: '#comments',
  data: {
    comments: [],
    newComment: ''
  },
  computed: {
    reversedComments: function() {
      return this.comments.slice().reverse();
    }
  },
  methods: {
    addComment: function() {
      if (this.newComment.trim() !== '') {
        this.comments.push(this.newComment);
        this.newComment = '';
      }
    }
  }
});

const subscribeElement = document.querySelector('.js-subscribe-button');

function subscribe() {
  if (subscribeElement.innerText === 'SUBSCRIBE') {
    subscribeElement.innerText = 'SUBSCRIBED';
    subscribeElement.classList.add('is-subscribed')
    alert('You have subscribed to the page!');
  } else {
    subscribeElement.innerText = 'SUBSCRIBE';
    subscribeElement.classList.remove('is-subscribed')
  }
};
