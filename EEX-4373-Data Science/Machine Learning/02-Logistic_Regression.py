from sklearn.linear_model import LogisticRegression
import numpy as np 
import matplotlib.pyplot as plt 

# Data 
x = np.array([[30], [40], [50], [60], [70], [80]])
y = np.array([0, 0, 0, 1, 1, 1])  # 0: Fail, 1: Pass

# Model 
model = LogisticRegression()
model.fit(X, y)

# Predict 
X_test = np.linspace(20, 90, 100).reshape(-1, 1)
y_prob = model.predict_proba(X_test)[:, 1]

# Plot
plt.plot(X_test, y_prob, color='green')
plt.title("Logistic Regression")
plt.xlabel("Score")
plt.ylabel("Probability of Pass")
plt.grid(True)
plt.show()

