import { createSlice } from '@reduxjs/toolkit'

export const footerSlice = createSlice({
    name: 'footer',
    initialState: {
        hasEnteredVP: false,
        inViewport: false,
        hasLeftVP: false,
        scrollValue: 0,
    },
    reducers: {
        setHasEnteredFooter: (state) => {
            state.hasEnteredVP = true;
            state.inViewport = true;
            state.hasLeftVP = false;
        },
        setHasLeftFooter: (state) => {
            state.hasEnteredVP = false;
            state.inViewport = false;
            state.hasLeftVP = true;
        },
    },
})

// Action creators are generated for each case reducer function
export const { setHasEnteredFooter, setHasLeftFooter } = footerSlice.actions

export default footerSlice.reducer