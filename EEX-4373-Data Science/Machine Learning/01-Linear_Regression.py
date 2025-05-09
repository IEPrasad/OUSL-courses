import numpy as np
import matplotlib.pyplot as plt
from sklearn.linear_model import LinearRegression 

# Sample data 
X = np.array([[1], [2], [3], [4], [5]])    # Feature 
y = np.array([2, 4, 5, 4, 5])              # Target 

# Model 
model = LinearRegression()
model.fit(X, y)

# Predictions
y_pred = model.predict(X)

# Plot
plt.scatter(X, y, color='blue')
plt.plot(X, y_pred, color='red')
plt.title("Linear Regression")
plt.xlabel("X")
plt.ylabel("y")
plt.show()

