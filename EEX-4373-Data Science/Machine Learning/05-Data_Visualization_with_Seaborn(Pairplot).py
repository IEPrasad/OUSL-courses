import seaborn as sns 
import matplotlib.pyplot as plt 
from sklearn.datasets import load_iris
import pandas as pd

iris = load_iris()
df = pd.DataFrame(iris.data, columns=iris.feature_names)
df['target'] = iris.target

# Plot 
sns.pairplot(df, hue='target')
plt.show()

