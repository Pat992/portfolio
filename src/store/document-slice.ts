import { createSlice } from '@reduxjs/toolkit'

export const documentSlice = createSlice({
    name: 'doc',
    initialState: {
        hasLoaded: false,
        mouseY: 0,
        mouseX: 0,
        value: 0,
        rawValue: 0,
        bodyHeight: Math.max(document.body.scrollHeight, document.body.offsetHeight, document.documentElement.clientHeight, document.documentElement.scrollHeight, document.documentElement.offsetHeight)
    },
    reducers: {
        setScrollValue: (state, action) => {
            state.value = action.payload;
        },
        setScrollRawValue: (state, action) => {
            state.rawValue = action.payload;
        },
        setMousePosition: (state, action) => {
            state.mouseX = action.payload.x;
            state.mouseY = action.payload.y;
        },
        setHasLoaded: (state) => {
            state.hasLoaded = true;
        }
    },
})

// Action creators are generated for each case reducer function
export const { setScrollValue, setScrollRawValue, setMousePosition, setHasLoaded } = documentSlice.actions

export default documentSlice.reducer