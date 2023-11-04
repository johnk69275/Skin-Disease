import pickle
import streamlit as st
from PIL import Image

st.markdown(
     f"""
     <style>
     
    .stApp {{
            background: url("put your image here");
            background-size: cover
        }}

 
     </style>
     """,
     unsafe_allow_html=True
 )

# loading

with open("model.pkl", 'rb') as file:
    clf = pickle.load(file)


#model = tf.keras.models.load_model('model.h5')

image = Image.open('logo.JPG')
st.image(image)

# user input
st.write("Upload image here:")