from bokeh.plotting import figure
from bokeh.io import output_file,show

x=[1,2,3,4,5]
y=[5,6,7,8,9,10]

output_file("line_graph.html")

f = figure()

f.line(x,y)
f.triangle(x,y)
show(f)