from sklearn.cluster import KMeans
import matplotlib.pyplot as plt 
import numpy as np

# Random points
X = np.random.rand(100, 2)

# K-Means
kmeans = KMeans(n_clusters=3)
kmeans.fit(X)  # Fixed typo: 'Kmeans' -> 'kmeans'
labels = kmeans.labels_

# Plot
plt.scatter(X[:, 0], X[:, 1], c=labels)
plt.title("K-Means Clustering")
plt.show()

# ----------------------
# Changes made:
# Fixed typo: changed 'Kmeans.fit(X)' to 'kmeans.fit(X)' (Python is case-sensitive)
# ----------------------
