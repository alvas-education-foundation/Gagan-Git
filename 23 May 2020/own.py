import folium
import pandas




map = folium.Map(location=[15.317277, 75.713890], zoom_start=7, tiles="Stamen Terrain")

fgv = folium.FeatureGroup(name="Karnataka")

fgv.add_child(folium.Marker(location=[15.44, 75.45], popup="This is Karnataka", icon=folium.Icon(color='green')))

map.add_child(fgv)
map.save("own.html")