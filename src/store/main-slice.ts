import { createSlice } from '@reduxjs/toolkit'

export const mainSlice = createSlice({
    name: 'main',
    initialState: {
        hasEnteredVP: false,
        inViewport: false,
        hasLeftVP: false,
        scrollValue: 0,
        hasDoneIconAnim: false,
    },
    reducers: {
        setHasEnteredMain: (state) => {
            state.hasEnteredVP = true;
            state.inViewport = true;
            state.hasLeftVP = false;
        },
        setHasLeftMain: (state) => {
            state.hasEnteredVP = false;
            state.inViewport = false;
            state.hasLeftVP = true;
        },
        setHasDoneIconAnim: (state) => {
            state.hasDoneIconAnim = true;
        }
    },
})

// Action creators are generated for each case reducer function
export const { setHasEnteredMain, setHasLeftMain, setHasDoneIconAnim } = mainSlice.actions

export default mainSlice.reducer