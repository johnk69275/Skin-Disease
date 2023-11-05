import pickle
import PIL
import streamlit as st
import numpy as np
import cv2
from PIL import Image
Str_to_Int = {
    'Actinic keratosis': 0,
    'Atopic Dermatitis': 1,
    'Benign keratosis': 2,
    'Dermatofibroma': 3,
    'Melanocytic nevus': 4,
    'Melanoma': 5,
    'Squamous cell carcinoma': 6,
    'Tinea Ringworm Candidiasis': 7,
    'Vascular lesion': 8
}
Int_to_Str = {v: k for k, v in Str_to_Int.items()}

st.markdown(
     f"""
     <style>
     *{{color:white}}
    .stApp {{
            background: url("https://media.istockphoto.com/id/1414981473/photo/futuristic-flight-through-a-digital-line-landscape-blue-dust-particle-abstract-background-3d.webp?b=1&s=170667a&w=0&k=20&c=nR3IdRbSFibEagWhoCRY_d-WyEJJSv0BLcIsmJJYN5M=");
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

#image = Image.open('logo.JPG')
#st.image(image)

# user input
st.write("Upload image here:")
uploaded_file = st.file_uploader("Choose a file", accept_multiple_files=False)

if uploaded_file:
    uploaded_file = PIL.Image.open(uploaded_file)
    imgpath=uploaded_file.convert('RGB')
    img = np.asarray(imgpath)
    img = cv2.resize(img, (240,240))
    img=img/255.
    img=img[np.newaxis]
    #print(img)
    pred = clf(img)
    st.write(pred)
    maxIndex = np.argmax(pred) 
    x = Int_to_Str[maxIndex]
    st.write(x)