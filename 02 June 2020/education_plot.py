from bokeh.plotting import figure
from bokeh.io import output_file , show
import pandas as pd

df1 = pd.read_csv("bachelors.csv")
x = df1["Year"]
y = df1["Engineering"]


output_file("line_graph_from_bachelors.html")

f = figure()

#f.line(x,y)
f.triangle(x,y)
show(f)
df1