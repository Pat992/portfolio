import { createSlice } from '@reduxjs/toolkit'
import { MotionValue } from 'framer-motion'

export const scrollSlice = createSlice({
    name: 'scroll',
    initialState: {
        value: 0,
    },
    reducers: {
        setScrollValue: (state, action) => {
            state.value = action.payload;
        },
    },
})

// Action creators are generated for each case reducer function
export const { setScrollValue } = scrollSlice.actions

export default scrollSlice.reducer