from sklearn.tree import DecisionTreeClassifier
from sklearn import datasets
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score

# Load data 
iris = datasets.load_iris()
X = iris.data
y = iris.target

# Train/test split
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.3)

# Model
model = DecisionTreeClassifier()
model.fit(X_train, y_train)

# Predict and Accuracy 
y_pred = model.predict(X_test)
print("Accuracy:", accuracy_score(y_test, y_pred))
