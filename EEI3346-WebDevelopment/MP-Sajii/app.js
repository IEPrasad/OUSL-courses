// Toggle Navigation Menu
const toggleMenu = document.querySelector('.toggle-menu');
const navLinks = document.querySelector('.nav-links');

toggleMenu.addEventListener('click', () => {
  navLinks.classList.toggle('show');
});

// Handle Feedback Form Submission
const feedbackForm = document.getElementById('feedback-form');
const feedbackList = document.getElementById('feedback-list');

feedbackForm.addEventListener('submit', (event) => {
  event.preventDefault();

  const feedback = document.getElementById('feedback').value.trim();

  if (feedback) {
    const li = document.createElement('li');
    li.textContent = feedback;
    feedbackList.appendChild(li);
    feedbackForm.reset();
  }
});
